
1. add lombok plugin to your IDE. Follow below URL for help

https://codippa.com/lombok/installing-lombok/

Note: After Installing restart your IDE and update maven project.

2. Change database properties in application.properties according to your database.

3. This application will run on port-8085 by default. for any change please refer to application.properties

4. URLs for PostMan->

(A) User Register
	http://localhost:8085/register
(B) User Login(provide parameters for the same)
	http://localhost:8085/login	 
(C)Apply Loan
	http://localhost:8085/applyloan/
(D)Admin Account creation
	http://localhost:8085/admin/cred
(E)Admin Login
	http://localhost:8085/admin/login
(F)Check Loan Application Status
	http://localhost:8085/admin/status
(G)For Loan Approval
	http://localhost:8085/admin/approval/

Note:-> for params and body refer the source code.
	
	
	
