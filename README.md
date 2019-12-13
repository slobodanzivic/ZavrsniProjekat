# ZavrsniProjekat
##Final project 

### ZavrsniProjekat is used for testing functionalities  

Target application URL is: ``https://www.phptravels.net/admin``  
Target browser: Chrome  
Browser version: 77.0.3865.90

Run test suite: `testng.xml`
Total tests run: 21

Used libraries: 
- TestNG automation testing framework  
- Selenium portable framework for testing web applications 
- Apache POI library for manipulating various file formats 

JavaDoc is located in `doc` folder.

The following website functionalities are tested: 
- login
- logout
- login with checkbox (remember me logic)
- forget password
- left menu ( Dashboard, Updates, Modules, Tours-Add New, Coupons, Newsletter, Bookings, Cars-Car)
- upload image
- entering data into input fields
- edit existing data
- select from drowdown menu
- search data
- checkbox functionality
- basic table checks (column values, links in a table)


## This project contains 4 packages:
- pages
- tests
- tests.support
- tests.support.model  
All packages are in the `src` folder.

## Package `pages` contains 10 classes:
- BasicPage
- CustomerManagementPage
- ForgetPasswordPage
- LoginPage
- LogoutPage
- TitlePage
- TravelCustomerPage
- TravelsCarsExtrasPage
- TravelsCarsPage
- TravelsMenuPage

## Package `tests` contains 8 classes:
- CustomerManagementTest
- ForgetPasswordTest
- LeftMenuTest
- LoginTest
- LogoutTest
- TravelCustomerTest
- TravelsCarsExtrasTest
- TravelsCarsTest

## Package `test.support` contains 2 clasees:
- BasicTest
- LoginLogoutSupport

Support classes are used in login/logout logic and for assigning driver.

## Package `test.support.model` contains 3 classes:
- Car
- Customer
- Menu

## Folder `data` contains 2 subfolders:
- docs - documents used for testing login
- img - documents used for testing upload photo 
