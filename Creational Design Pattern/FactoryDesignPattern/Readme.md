FACTORY DESIGN PATETRN

CREATIONAL DESIGN PATTERN THAT HELPS CREATE OBJECTS.
IT SAYS DEFINE AN INTERFACE FOR CREATING OBJECT AND LET THE SUBCLASS DECIDE WHAT TYPE OF OBJECT TO CREATE.

IN THIS PATTERN THERE IS ONE FACTORY CLASS WHICH WILL RETURN THE OBJECTS OF THE SPECIED TYPE.

THERE WILL BE AN INTERFACE FOR THE OBJECT. SPECIFIC OBJECT CLASSES WILL IMPLEMENT THIS INTERFACW AND PERFORM CERTAIN FUNCTIONS.

THE FACTORTY CLASS WILL RETURN THE SPECIFIED OBJECT FROM ONE OF THE GIVEN CLASSES.
IN THIS THE ACTUAL CLASS IS HIDDEN FROM THE USER AND ONLY THE FACTORY IS SHOWN TO USER
USER CAN SPECIFY THE TYPE OF OBJECT HE NEDS AND THE FACTORY WILL PROVIDE HIM WITH THAT OBJECT.

SO BASICALLY THE ONJECT CREATION LOGIC IS HIDDEN FROM THE USER.
IN OUR EXAMPLE THE NOTIFICAITON FACTORY IS CREATING AND RETURNING TO THE USER THE SPECIFIED TYPE OF NOTIFICATION AND THE ACTUAL CREATION OF NOTIFICATION LOGIC IS HIDDEN FROM THE USER.


INTERFACE NOTIFICATION ==> IMPLEMENTED BY CLASSES SMS, EMAIL, PUSHNOTIF
CLASS NOTIFICATIONFACTORY ==> RETURNS THE SPECIFIED TYPE OF NOTIF...MIAN ME ISKA OBJECT BANEGA
TEST ==> CONTAINS MAIN.