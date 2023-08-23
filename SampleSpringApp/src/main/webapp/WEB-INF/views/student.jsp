<%@ include file="header.jsp"%>
<%@ include file="nav.jsp"%>
<div class="container">
	<div class="card">
		<div class="card-header bg-primary text-white">
			<h1 class="fs-1">Student Details</h1>
		</div>
		<div class="card-body">
			<div class="row">
				<div class="card">
					<div class="card-header bg-success text-white">
						<h1 class="fs-3">Personal Details</h1>
					</div>
					<div class="card-body">
							<table class="table table-striped">
								<tbody>
									<tr>
										<th>Student ID</th>
										<td>${student.id}</td>
									</tr>
									<tr>
										<th>First Name</th>
										<td>${student.firstName}</td>
									</tr>
									<tr>
										<th>Last Name</th>
										<td>${student.lastName}</td>
									</tr>
									<tr>
										<th>Roll Number</th>
										<td>${student.rollNumber}</td>
									</tr>
									<tr>
										<th>Class</th>
										<td>${student.student_Class}</td>
									</tr>
									<tr>
										<th>Section</th>
										<td>${student.section}</td>
									</tr>
								</tbody>
							</table>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="card">
					<div class="card-header bg-success text-white">
						<h1 class="fs-3">Marks Details</h1>
					</div>
					<div class="card-body">
						<table class="table table-striped table-info">
								<tbody>
									<tr>
										<th>English Marks</th>
										<td>${student.english}</td>
									</tr>
									<tr>
										<th>Science Marks</th>
										<td>${student.science}</td>
									</tr>
									<tr>
										<th>Computer Marks</th>
										<td>${student.computer}</td>
									</tr>
									<tr>
										<th>Maths Marks</th>
										<td>${student.maths}</td>
									</tr>
									<tr>
										<th>SST Marks</th>
										<td>${student.sst}</td>
									</tr>
									<tr>
										<th>Total Marks</th>
										<td>${student.total}</td>
									</tr>
									<tr>
										<th>Average</th>
										<td>${student.average}</td>
									</tr>
									<tr>
										<th>Grade</th>
										<td>${student.grade}</td>
									</tr>
								</tbody>
							</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>