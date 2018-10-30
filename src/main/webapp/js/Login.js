$(document).ready(function() {


	var signto = document.getElementById("signto");

	signto.onclick = function() {
		for (var i = 0; i < document.form1.elements.length - 1; i++) {
			if (document.form1.elements[i].value == "") {
				alert("输入值不能为空");
				document.form1.elements[i].focus();
				return false;
			}
		}
		return true;


	}


});