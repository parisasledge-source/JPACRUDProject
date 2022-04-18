## JPACRUDProject

### Description

JPACRUDProject is a Ib app which prompts the user to choose from a menu option including:

1. Display Planet
2. Add Planet
3. Update Planet
4. Delete Planet

The first option, is a single text box which prompts the user to enter a Planet's ID, and it includes clicking on "Display Planet" submit button. This will open another page and user can see the details of the planet, including "Planet Name" (as the title of the page), "Color" and "Description" of the planet in the new Ib page. If the planet is not found by entered id, they see a blank new Ib page with a button "Home" which allows return back to the home page.

If user chooses "Add planet", they can add a new planet to the list. This option includes two text boxes labeled as 'Planet name' and 'Planet Color' which prompts the user to enter a planet's name and a planet's color ('Planet Description' will be added in the future). This option also includes clicking on "Add Planet" submit button which opens a new page and user can see the details of the planet added to the list, including "Planet Name" (as the title of the page) and "Color" of the planet in the new Ib page.

In the third option, the user have the option of editing by clicking on "Update planet" submit button. This option includes three text boxes labeled as 'Planet ID', 'Planet name' and 'Planet Color'. In the first text box the user is prompted to enter the ID of the planet they desire to edit. The second and third text boxes are the entry boxes for the name and color of the new planet which this position is going to be updated to. When they submit the form, that planet's record is updated in the database and a new page will display the updated properties.

The final option is "Delete Planet" option. This option includes a text box labeled as 'Planet ID' which prompts the user to enter the id of the planet they desire to delete from the list of database. Clicking on the "Delete Planet" submits the delete action and the planet is removed from the list of database.

### Lessons Learned

**Concepts over Syntax:**
This project helped me understand more about Controllers (relational mapping/the data pattern itself) actually pass/receive data from the form actions and how that data ultimately is presented in the View.
Concepts where I've done lots of examples went fine though like JDBC (created the connection, Prepared Statement, and Exception Handling).
I learned how the CRUD methods are made. I learned more about syntax early on, and understood how the ModelAndView worked in concept. I learned how to add the Objects to the MV instance correctly.
Our examples thus far were "@RequestParam" examples where I took things like "keyword" as a String directly from the form just to GET/query to database. So when I had to 'create/post' stuff it took me a good while to let the Controller only worry about the ModelAndView and forward the form field to object work to the JDBCImpl.

**Small mistakes make for big Errors:**
When creating the method to create a planet as well as delete a planet I found getting the smallest mistake could really sabotage my program in a big way. For the create a planet function I kept seeing this error that indicated that the parameters that the select statement took from the user were not being accepted. I find a small report on the html instead of using name for two parameters, I used id. Excited to be done with this bug I ran the program again to once again see the same error. I tried adjusting the parameters to no avail and finally with the help of another couple sets of eyes I saw it, a missing parenthesis was creating a huge errors in my program. The closing parentheses on the select statement was just outside of my view. Once I resolved those issues I had functioning code that was able to accept input and create a data base item that could be edited, or deleted.


### Technology Used

1. MySQL Database for Objects, creating my own database (planets)
2. Updating the data in the mySQLWorkBench and forward engineering them
2. Connecting the database to JPACrudProject codes in spring Tool Suit
2. DAO (Connectivity)
3. CRUD (in the PS)
4. HTML/CSS (Bootstrap)
5. Spring (JSP, XML config, etc.)
6. Junit test for the entity file (planet) successful
