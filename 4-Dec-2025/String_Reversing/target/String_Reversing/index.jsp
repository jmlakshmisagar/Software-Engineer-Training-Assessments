<html>
<body>
	<h2>String Reverse</h2>

	<form>
		Enter String : <input type="text" id="str" name="str"><br><br>
		<button type="button" onclick="reverser()">Reverse	</button>
	</form>

	<p id="output"></p>

	<script>
		async function reverser() {
			let reverserString = document.getElementById("str").value;

			let response = await fetch("ReversePractice", {
				method: "POST",
				headers: {
					"Content-Type": "application/x-www-form-urlencoded"
				},
				body: "reverserString=" + reverserString
			});

			let result = await response.text();
			document.getElementById("output").innerHTML = result;
		}
	</script>

</body>
</html>
