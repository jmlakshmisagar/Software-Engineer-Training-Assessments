<!DOCTYPE html>
<html>
<body>
    <h2>String Reverse</h2>

    <form onsubmit="return false;">
        Enter String :
        <input type="text" id="str" name="str"><br><br>

        <button type="button" onclick="reverser()">Reverse</button>
    </form>

    <p id="output"></p>

    <script>
        async function reverser() {
            let input = document.getElementById("str").value;

            if (!input.trim()) {
                document.getElementById("output").innerHTML = "Please enter a string.";
                return;
            }

            let response = await fetch("ReversePractice", {
                method: "POST",
                headers: {
                    "Content-Type": "application/x-www-form-urlencoded"
                },
                body: "reverserString=" + encodeURIComponent(input)
            });

            let result = await response.text();
            document.getElementById("output").innerHTML = result;
        }
    </script>

</body>
</html>
