<html>
<body>
	<h2>Async Demo</h2>

	<form>
		User name : <input type="text" id="uname" name="uname"><br><br>
		Password : <input type="text" id="password" name="password"><br><br>
		<button type="button" onclick="login()">Login</button>
	</form>

	<p id="output"></p>

	<script>
		async function login() {
			let username = document.getElementById("uname").value;
			let password = document.getElementById("password").value;

			let response = await fetch("AsyncPractice", {
				method: "POST",
				headers: {
					"Content-Type": "application/x-www-form-urlencoded"
				},
				body: "uname=" + username + "&password=" + password
			});

			let result = await response.text();
			document.getElementById("output").innerHTML = result;
		}
	</script>

</body>
</html>
