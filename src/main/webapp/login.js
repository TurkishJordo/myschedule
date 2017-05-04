var attempt = 3;

	function validate() {
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;

	if (username == "aidan" && password == "delaney") {
		alert ("Welcome, Aidan!");
		window.location = "/myschedule/cadbf911822249e58e0de86906c9dcd8.jsf";
       return false;
}
	if (username == "jordan" && password == "ellis") {
		alert ("Welcome, Jordan!");
		window.location = "/myschedule/cadbf911822249e58e0de86906c9dcd8.jsf";
       return false;
}
	else{
		attempt --;
		alert("Credentials not recognised. You have "+attempt+" attempts remaining!");
	if( attempt == 0){
			document.getElementById("username").disabled = true;
			document.getElementById("password").disabled = true;
			document.getElementById("submit").disabled = true;
	   return false;
	}
  }
}