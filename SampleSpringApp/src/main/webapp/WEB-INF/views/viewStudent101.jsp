<%@ include file="header.jsp"%>
<%@ include file="nav.jsp"%>


<div class="container">
	<div class="card">
		<div class="card-header bg-primary text-white">
			<h1>Student List</h1>
		</div>
		<div class="card-body">
			<c:if test="${not empty success}">
				<div class="col-xs-12 offset-md-1 col-md-11">
					<div class="text-white bg-success fs-2">${success}</div>
				</div>
			</c:if>

			<c:if test="${not empty error}">
				<div class="col-xs-12 offset-md-1 col-md-11">
					<div class="text-white bg-danger fs-2">${error}</div>
				</div>
			</c:if>
			<table class="table">
				<thead>
					<tr>
						<th>Roll Number</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Class</th>
						<th>Section</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${studentlist}" var="s">
						<tr>
							<td>${s.rollNumber}</td>
							<td>${s.firstName}</td>
							<td>${s.lastName}</td>
							<td>${s.student_Class}</td>
							<td>${s.section}</td>
							<td>
							<a href="delete?id=${s.id}" class="btn btn-danger btn-sm">Delete</a> 
							<a href="update?id=${s.id}" class="btn btn-warning btn-sm">Update</a>
							<a href="search?id=${s.id}" class="btn btn-primary btn-sm">View</a>
							</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
</div>
</body>
</html>