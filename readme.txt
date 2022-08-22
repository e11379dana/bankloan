Please run Backend code (bankloan folder) as Maven project (on port 8080), and frontend (frontend folder) using ng serve (on port 4200). 

Home:
	* list down all the Loan details
	* user can search loans by Applicant name

In Applicant screen user can,
	* add a applicant by clicking Add Applicant
	* Edit/Delete applicant by respective buttons (no confiramation pop up on Delete)
	* Go into applicant view to add a Facility
	* once facility is selected and Add Facility button is clicked, system will navigate to Loan creation view and user can add a Loan to the Applicant
	
In Facility screen user can,
	* create Facilities by clicking Add Facility
	* Edit/Delete facility by respective buttons (no confiramation pop up on Delete)
		*** error handlings are not implemnted. So user can delete any facility. That will cause Loan loading error. // TO DO

// TO DO
- Error handling is not impemented
- One controller is used. Can Split based on Applicant, Facility and Loan
- Service layer is not implemented for Applicant
- No Back Buttons
- Delete function is implemented validations on loading are not done, so if user delete any record better starting backend again