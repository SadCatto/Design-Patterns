PROXY DESIGN PATTERN

PROXY DESIGN PATTERN IS USED TO HIDE THE COMPLEXITY OF REAL OBJECT FROM THE USER.
IT IS ALSO USED TO VALIDATE AND THEN GIVE THE RESULTS
FOR EXAMPLE WE CAN USE PROXY TO CHECK IF THE USER HAS SUBSCRIBED TO CERTAIN SERVICES AND IF THE USER IS SUBSCRIBED WE CAN GRANT THE REQUEST OR ELSE WE CAN SHOW ONLY PROXY DATA AND NOT THE ACTUAL CONTENT.

IT IS IMPLEMENTED USING BASICSLLY 2 CLASSES. ONE FOR REAL OBJECT AND ONE FOR PROXY ONJECT '

FOR EXAMPLE THE INTERNET PROXY WHICH DENIES CONNECTION TO CERTAIN WEBSITES 
SO WELL HAVE AN INTERFACE INTERNET AND TWO CLASSES PROXYINTERNET AND REALINTERNET WHICH WILL IMPLEMENT THE INTERNET INTERFACE.

IN PROXYINTERNET WE CAN CHECK IF THE WEBSITE IS BANNED AND IF BANNED WE CAN INFORM THE USER THAT THE SITE IS BANNED.

IF THE SITE IS NOT BANNED WE WILL RENDER THE SITE USING REALINTERNET.