<%@ include file="header.jsp"%>
<%@ include file="nav.jsp"%>
<div class="container">
	<div class="card">
		<div class="card-header bg-primary text-white">
			<h1>Student Add Form</h1>
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

			<sf:form action="add" method="post" modelAttribute="student">
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">Roll Number</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="rollNumber" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">First Name</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="firstName" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">Last Name</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="lastName" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">Class</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="student_Class" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">Section</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="section" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">Maths Marks</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="maths" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">Science</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="science" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">SST</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="sst" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">English</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="english" />
					</div>
				</div>
				<div class="row">
					<label class="offset-md-1 col-md-3 fs-3">Computer</label>
					<div class="col-md-8">
						<sf:input type="text" class="form-control" path="computer" />
					</div>
				</div>
				<div class="row">

					<sf:input type="hidden" path="id"/>
					<div class="offset-md-4 col-md-4">
						<input type="submit" class="btn btn-primary btn-lg" value="Save" />
					</div>
				</div>
			</sf:form>
		</div>
	</div>
</div>
</body>
</html>