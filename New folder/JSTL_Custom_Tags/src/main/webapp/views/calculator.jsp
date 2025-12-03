<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Arithmetic Form</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body class="bg-light">

	<div class="container mt-5">
		<div class="card shadow-sm p-4">
			<h3 class="text-center mb-4">Arithmetic Calculator</h3>

			<form action="result.jsp" method="get">

				<!-- Number 1 -->
				<div class="mb-3">
					<label class="form-label">Enter Number 1</label> <input
						type="number" class="form-control" name="num1" maxlength="2"
						min="0" max="99" required>
				</div>

				<!-- Number 2 -->
				<div class="mb-3">
					<label class="form-label">Enter Number 2</label> <input
						type="number" class="form-control" name="num2" maxlength="2"
						min="0" max="99" required>
				</div>

				<!-- Arithmetic Operations -->
				<label class="form-label">Select Operation</label>
				<div class="mb-3">

					<div class="form-check">
						<input class="form-check-input" type="radio" name="op" value="add"
							required> <label class="form-check-label">Addition
							(+)</label>
					</div>

					<div class="form-check">
						<input class="form-check-input" type="radio" name="op" value="sub">
						<label class="form-check-label">Subtraction (-)</label>
					</div>

					<div class="form-check">
						<input class="form-check-input" type="radio" name="op" value="mul">
						<label class="form-check-label">Multiplication (×)</label>
					</div>

					<div class="form-check">
						<input class="form-check-input" type="radio" name="op" value="div">
						<label class="form-check-label">Division (÷)</label>
					</div>
				</div>

				<!-- Submit Button -->
				<button type="submit" class="btn btn-secondary w-100">Calculate</button>

			</form>
		</div>
	</div>

</body>
</html>
