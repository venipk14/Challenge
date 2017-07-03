# SQE Challenge
This document will have all the test cases to support this API is certified for the Public consumption. I have listed a few test cases below for the URL https://api.nasa.gov/planetary/sounds with multiple possibilities using the parameters "q", "limit" and "api_key." As I have initally identified the test cases to be performed, I also implemented a few test cases to be done in an automated way using Java and attached those in the same repository along with the Test Cases document in Microsoft Excel Format.

Also, the [Observations and Issues](https://github.com/venipk14/Challenge#observationsissues) are listed at the end of  this document. These should be more considered as Observations rather than Issues as I don't have any specific funtionality requirement related to the application.

## Test Cases:
1. [Test 1: Passing limit in request by setting limit to 2](https://github.com/venipk14/Challenge#test-1-passing-limit-in-request-by-setting-limit-to-2)

2. [Test 2: Passing limit in request by setting limit to 6](https://github.com/venipk14/Challenge#test-2-passing-limit-in-request-by-setting-limit-to-6)

3. [Test 3: Passing string in limit parameter](https://github.com/venipk14/Challenge#test-3-passing-string-in-limit-parameter)

4. [Test 4: Passing alphanumeric values in limit parameter](https://github.com/venipk14/Challenge#test-4-passing-alphanumeric-values-in-limit-parameter)

5. [Test 5: Passing limit in request by setting limit to -1](https://github.com/venipk14/Challenge#test-5-passing-limit-in-request-by-setting-limit-to--1)

6. [Test 6: Passing limit in request by setting limit to 0](https://github.com/venipk14/Challenge#test-6-passing-limit-in-request-by-setting-limit-to-0)

7. [Test 7: Passing Marsrover in q parameter](https://github.com/venipk14/Challenge#test-7-passing-marsrover-in-q-parameter)

8. [Test 8: Passing Integer value in q parameter](https://github.com/venipk14/Challenge#test-8-passing-integer-value-in-q-parameter)

9. [Test 9: Passing alpha numeric value in q parameter](https://github.com/venipk14/Challenge#test-9-passing-alpha-numeric-value-in-q-parameter)

10. [Test 10: Passing integer value in q parameter and string in limit parameter](https://github.com/venipk14/Challenge#test-10-passing-integer-value-in-q-parameter-and-string-in-limit-parameter)

11. [Test 11: Passing string in q parameter and string in limit parameter](https://github.com/venipk14/Challenge#test-11-passing-string-in-q-parameter-and-string-in-limit-parameter)

12. [Test 12: Passing another string in api_key parameter](https://github.com/venipk14/Challenge#test-12-passing-another-string-in-api_key-parameter)

13. [Test 13: Passing string as demo_key(lowercase) in api_key parameter](https://github.com/venipk14/Challenge#test-13-passing-string-as-demo_keylowercase-in-api_key-parameter)

14. [Test 14: Passing integer value in api_key parameter](https://github.com/venipk14/Challenge#test-14-passing-integer-value-in-api_key-parameter)

15. [Test 15: Passing integer values in q,limit & api_key parameters](https://github.com/venipk14/Challenge#test-15-passing-integer-values-in-qlimit--api_key-parameters)

16. [Test 16: Passing limit value more than 10 in limit parameter](https://github.com/venipk14/Challenge#test-16-passing-limit-value-more-than-10-in-limit-parameter)

17. [Test 17: Passing limit value more than 50 in limit parameter](https://github.com/venipk14/Challenge#test-17-passing-limit-value-more-than-50-in-limit-parameter)

18. [Test 18: Passing limit value more than 66 in limit parameter](https://github.com/venipk14/Challenge#test-18-passing-limit-value-more-than-66-in-limit-parameter)

19. [Test 19: Passing values without the limit parameter in the Url](https://github.com/venipk14/Challenge#test-19-passing-values-without-the-limit-parameter-in-the-url)

20. [Test 20: Passing values Without q and limit parameters in the Url](https://github.com/venipk14/Challenge#test-20-passing-values-without-q-and-limit-parameters-in-the-url)

21. [Test 21: Passing values Without api_key parameter](https://github.com/venipk14/Challenge#test-21-passing-values-without-api_key-parameter)

22. [Test 22: Continuous Requests](https://github.com/venipk14/Challenge#test-22-continuous-requests)

## Test 1: Passing limit in request by setting limit to 2
Verify wether user is able to get the successful response succesfully when limit is set to 2.
  
<b>Test Data  :</b>   q=apollo    limit=2     api_key=DEMO_KEY


<b>URL :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=2&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t1_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t1_2.png)

<b>Test Result:</b> Success

<b>Reason:</b> limit value is set to 2 and count in response is also 2, hence proved.

## Test 2: Passing limit in request by setting limit to 6
Verify wether user is able to get the successful response succesfully when limit is set to 6.

<b>Test Data  :</b>   q=apollo    limit=6     api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=6&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t2_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t2_2.png)

<b>Test Result:</b> Success

## Test 3: Passing string in limit parameter 
Verify wether user is able to get the unsuccessful response succesfully when limit is set to string value.

<b>Test Data  :</b>   q=apollo    limit=uan     api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=uan&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t3_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t3_2.png)

<b>Test Result:</b> Success

## Test 4: Passing alphanumeric values in limit parameter
Verify wether user is able to get the unsuccessful response succesfully when limit is set to alpha numeric.
  
<b>Test Data  :</b>   q=apollo    limit=nas129     api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=nas129&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t4_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t4_2.png)

<b>Test Result:</b> Success

## Test 5: Passing limit in request by setting limit to -1
Verify wether user is able to get the successful response succesfully when limit is set to -1.

<b>Test Data  :</b>   q=apollo    limit=-1     api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=-1&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t5_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t5_2.png)

<b>Test Result:</b> Success

## Test 6: Passing limit in request by setting limit to 0
Verify wether user is able to get the successful response succesfully when limit is set to 0.

<b>Test Data  :</b>   q=apollo    limit=0    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=0&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t6_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t6_2.png)

<b>Test Result:</b> Success

## Test 7: Passing Marsrover in q parameter
Verify wether user is able to get the successful response succesfully when user passes marsrover in q.

<b>Test Data  :</b>   q=marsrover    limit=2    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=marsrover&limit=2&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t7_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t7_2.png)

<b>Test Result:</b> Success

## Test 8: Passing Integer value in q parameter
Verify wether user is able to get the successful response succesfully when q is set to numeric value.

<b>Test Data  :</b>   q=2    limit=2    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=2&limit=2&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t8_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t8_2.png)

<b>Test Result:</b> Success

## Test 9: Passing alpha numeric value in q parameter
Verify wether user is able to get the successful response succesfully when q is set to alpha numeric value

<b>Test Data  :</b>   q=kv3    limit=2    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=kv3&limit=2&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t9_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t9_2.png)

<b>Test Result:</b> Success

## Test 10: Passing integer value in q parameter and string in limit parameter
Verify wether user is able to get the unsuccessful response succesfully when q is set to numeric value and string in limit

<b>Test Data  :</b>   q=3    limit=mars    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=3&limit=mars&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t10_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t10_2.png)

<b>Test Result:</b> Success

## Test 11: Passing string in q parameter and string in limit parameter
Verify wether user is able to get the unsuccessful response succesfully when passing string in q parameter and string in limit parameter

<b>Test Data  :</b>   q=apollo    limit=mars    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=mars&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t11_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t11_2.png)

<b>Test Result:</b> Success

## Test 12: Passing another string in api_key parameter
Verify wether user is able to get the unsuccessful response succesfully when passing another string in api_key parameter

<b>Test Data  :</b>   q=apollo    limit=2    api_key=dev11

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=2&api_key=dev11

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t12_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t12_2.png)

<b>Test Result:</b> Success

## Test 13: Passing string as demo_key(lowercase) in api_key parameter
Verify wether user is able to get the unsuccessful response succesfully when passing string as demo_key(lowercase) in api_key parameter

<b>Test Data  :</b>   q=apollo    limit=mars    api_key=demo_key

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=mars&api_key=demo_key

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t13_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t13_2.png)

<b>Test Result:</b> Success

## Test 14: Passing integer value in api_key parameter
Verify wether user is able to get the unsuccessful response succesfully when passing integer value in api_key parameter

<b>Test Data  :</b>   q=apollo    limit=mars    api_key=3

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=mars&api_key=3 

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t14_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t14_2.png)

<b>Test Result:</b> Success

## Test 15: Passing integer values in q,limit & api_key parameters
Verify wether user is able to get the unsuccessful response succesfully when passing integer values in q,limit & api_key parameters

<b>Test Data  :</b>   q=2    limit=7    api_key=5

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=2&limit=7&api_key=5

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t15_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t15_2.png)

<b>Test Result:</b> Success

## Test 16: Passing limit value more than 10 in limit parameter
Verify wether user is able to get the successful response succesfully when passing limit value more than 10 in limit parameter

<b>Test Data  :</b>   q=apollo    limit=11    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=11&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t16_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t16_2.png)

<b>Test Result:</b> Success

## Test 17: Passing limit value more than 50 in limit parameter
Verify wether user is able to get the successful response succesfully when passing limit value 50 in limit parameter

<b>Test Data  :</b>   q=apollo    limit=50    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=50&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t17_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t17_2.png)

<b>Test Result:</b> Success

## Test 18: Passing limit value more than 66 in limit parameter
Verify wether user is able to get the successful response succesfully when passing limit value 66 in limit parameter

<b>Test Data  :</b>   q=apollo    limit=66    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=66&api_key=DEMO_KEY 

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t18_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t18_2.png)

<b>Test Result:</b> Success

## Test 19: Passing values without the limit parameter in the Url
Verify wether user is able to get the successful response succesfully when passing values without the limit parameter in the URL

<b>Test Data  :</b>   q=apollo    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t19_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t19_2.png)

<b>Test Result:</b> Success

## Test 20: Passing values Without q and limit parameters in the Url
Verify wether user is able to get the successful response succesfully when passing values Without q and limit parameters in the URL

<b>Test Data  :</b>   api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?api_key=DEMO_KEY

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t20_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t20_2.png)

<b>Test Result:</b> Success

## Test 21: Passing values Without api_key parameter
Verify wether user is able to get the unsuccessful response succesfully when passing without api_key parameter

<b>Test Data  :</b>   q=apollo

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo 

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t21_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t21_2.png)

<b>Test Result:</b> Success

## Test 22: Continuous Requests
Verify wether user is able to get the unsuccessful response succesfully when hitting the server with continues requests

<b>Test Data  :</b>   q=apollo    limit=11    api_key=DEMO_KEY

<b>URL  :</b> https://api.nasa.gov/planetary/sounds?q=apollo&limit=11&api_key=DEMO_KEY 

<b>Response:</b>

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t22_1.png)

![alt text](https://github.com/venipk14/SupportingImages/blob/master/t22_2.png)

<b>Test Result:</b> Success

## Observations/Issues:
1. While performing the [Test 8: Passing Integer value in q parameter](https://github.com/venipk14/Challenge#test-8-passing-integer-value-in-q-parameter) and [Test 9: Passing alpha numeric value in q parameter](https://github.com/venipk14/Challenge#test-9-passing-alpha-numeric-value-in-q-parameter), the parameter "q" is accepting both integer and alpha-numeric values where it is supposed to accept only "string."

2. While performing the [Test 18: Passing limit value more than 66 in limit parameter](https://github.com/venipk14/Challenge#test-18-passing-limit-value-more-than-66-in-limit-parameter) in the response, count should be displayed as 66. But, in this case, the result is shown as 64. All the values greater than 64 for the limit parameter are displayed as 64 only.
