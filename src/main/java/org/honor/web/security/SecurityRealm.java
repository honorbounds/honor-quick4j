package org.honor.web.security;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.honor.web.model.Permission;
import org.honor.web.model.Role;
import org.honor.web.model.User;
import org.honor.web.model.UserInfood;
import org.honor.web.service.EnterService;
import org.honor.web.service.PermissionService;
import org.honor.web.service.RoleService;
import org.honor.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户身份验证,授权 Realm 组件
 * 
 * @author StarZou
 * @since 2014年6月11日 上午11:35:28
 **/
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {

	@Resource
	private UserService userService;

	@Resource
	private RoleService roleService;

	@Resource
	private PermissionService permissionService;

	@Autowired
	EnterService enterService;

	/**
	 * 权限检查
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		String username = String.valueOf(principals.getPrimaryPrincipal());

		final User user = userService.selectByUsername(username);
		final List<Role> roleInfos = roleService.selectRolesByUserId(user
				.getId());
		for (Role role : roleInfos) {
			// 添加角色
			System.err.println(role);
			authorizationInfo.addRole(role.getRoleSign());

			final List<Permission> permissions = permissionService
					.selectPermissionsByRoleId(role.getId());
			for (Permission permission : permissions) {
				// 添加权限
				System.err.println(permission);
				authorizationInfo.addStringPermission(permission
						.getPermissionSign());
			}
		}
		return authorizationInfo;
	}

	/**
	 * 登录验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String phone = String.valueOf(token.getPrincipal());
		String password = String.valueOf(token.getCredentials());
		// 通过数据库进行验证
		final UserInfood authentication = enterService.userLogin(phone, password);
		if (authentication == null) {
			throw new AuthenticationException("用户名或密码错误.");
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				phone, password, getName());
		return authenticationInfo;
	}

}
