<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<c:import url="header.jsp"></c:import>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #eee;">
	<div class="container py-10">

		<div class="card">
			<div class="card-body">
				<div class="row d-flex justify-content-center pb-20">
					<div class="col col-xl-10 mb-8 mb-md-0">
						<div class="py-8 d-flex flex-row">
							<h5>
								<span class="far fa-check-square pe-2"></span> &nbsp;<b></b>
							</h5>
						</div>
						<h4>Customer Details</h4>
						<div class="col-md-12"></div>
						<div class="col-md-12">
							<h6>
								ID :&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
								&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
								<c:out value="${userList.id }"></c:out>
							</h6>
						</div>
						<div class="col-md-8">
							<div>
								<h6>
									Name :&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
									&nbsp;&nbsp;&nbsp; &nbsp;
									<c:out value="  ${userList.lastName }"></c:out>


								</h6>
							</div>
						</div>

						<div class="col-md-10">
							<h6>
								Email ID :&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
								&nbsp;&nbsp;
								<c:out value="${userList.email }"></c:out>
							</h6>
						</div>

						<div class="col-md-8">
							<h6>
								Gender :&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<c:out value="${userList.gender}"></c:out>
							</h6>
						</div>
						<div class="col-md-8">
							<h6>
								Primary Contact :&nbsp; &nbsp;&nbsp;&nbsp;
								<c:out value=""></c:out>
							</h6>
						</div>

						<div class="col-md-8">
							<h6>
								Alternate Contact :&nbsp; &nbsp;
								<c:out value=""></c:out>
							</h6>
						</div>
						<hr />
						<div class="pt-2">
							<div class="d-flex pb-2">
								<h5>
									<span class="far fa-check-square pe-2"></span> &nbsp;<b></b>
								</h5>
								<div>
									<h4>Policy Details</h4>
								</div>

							</div>
							<p>
							<div class="col">
								<h6>
									Policy ID :&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
									<c:out value="${policyDetails.policyId }"></c:out>
								</h6>
							</div>
							<div class="col-md-8">
								<div>
									<h6>
										Policy Type :&nbsp;&nbsp;&nbsp;
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<c:out value="${policyDetails.policyType }"></c:out>
									</h6>
								</div>
							</div>

							<div class="col-md-10">
								<h6>
									Policy Start Date :&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
									<c:out value="${policyDetails.policyStartDate }"></c:out>
								</h6>
							</div>

							<div class="col-md-8">
								<h6>
									Policy End Date :&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<c:out value="${policyDetails.policyEndDate}"></c:out>
								</h6>
							</div>
							<div class="col-md-8">
								<h6>
									Premium Amount :&nbsp;&nbsp;&nbsp; &nbsp;
									<c:out value="${policyDetails.premiumAmount}"></c:out>
								</h6>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-15 col-xl-8 offset-xl-0">

					<div class="rounded d-flex flex-column p-25">
						<div class="p-4 me-3">
							<table style="width: 100%" border="1px solid black"
								class="tblAlign">
								<div class="pt-2">
									<div class="d-flex pb-2">
										<h5>
											<span class="far fa-check-square pe-2"></span> &nbsp;<b></b>
										</h5>
										<div>
											<h2>Transaction History</h2>
										</div>

									</div>
									<p>
									<div class="col-md-12">
										<tr>
											<th>ID</th>
											<th>Customer Email</th>
											<th>Transaction ID</th>
											<th>Amount</th>
											<th>Date</th>
											<th>Policy Type</th>
											<th>Transaction Status</th>


										</tr>
										<c:forEach var="customer" items="${transactionHistory}">


											<tr>
												<td><c:out value="${customer.id }"></c:out></td>
												<td><c:out value="${userList.email }"></c:out></td>

												<td><c:out value="${customer.transactionId}"></c:out></td>

												<td><c:out value="${customer.amount}"></c:out></td>
												<td><c:out value="${customer.date}"></c:out></td>

												<td><c:out value="${policyDetails.policyType }"></c:out>
												</td>
												<td><b><c:out value="${customer.transactionStatus}"></c:out></b></td>



											</tr>
										</c:forEach>
							</table>


							<%--<div class="border-top px-2 mx-2"></div>
								<div class="p-2 d-flex pt-3">
									<div class="col-8">
										<b>Total</b>
									</div>
									 <div class="ms-auto">
										<b class="text-success">$85.00</b>--%>
						</div>
					</div>

				</div>

			</div>

		</div>
	</div>
</body>
</html>

