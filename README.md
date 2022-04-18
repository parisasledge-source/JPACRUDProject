## JPACRUDProject

### Description

JPACRUDProject is a web app which prompts the user to choose from a menu option including:

1. Display Planet
2. Add Planet
3. Update Planet
4. Delete Planet

The first option, is a single text box which prompts the user to enter a Planet's ID, and it includes clicking on "Display Planet" submit button. This will open another page and user can see the details of the planet, including "Planet Name" (as the title of the page), "Color" and "Description" of the planet in the new web page. If the planet is not found by entered id, they see a blank new web page with a button "Home" which allows return back to the home page.

If user chooses "Add planet", they can add a new planet to the list. This option includes two text boxes labeled as 'Planet name' and 'Planet Color' which prompts the user to enter a planet's name and a planet's color ('Planet Description' will be added in the future). This option also includes clicking on "Add Planet" submit button which opens a new page and user can see the details of the planet added to the list, including "Planet Name" (as the title of the page) and "Color" of the planet in the new web page.

In the third option, the user have the option of editing by clicking on "Update planet" submit button. This option includes three text boxes labeled as 'Planet ID', 'Planet name' and 'Planet Color'. In the first text box the user is prompted to enter the ID of the planet they desire to edit. The second and third text boxes are the entry boxes for the name and color of the new planet which this position is going to be updated to. When they submit the form, that planet's record is updated in the database and a new page will display the updated properties.

The final option is "Delete Planet" option. This option includes a text box labeled as 'Planet ID' which prompts the user to enter the id of the planet they desire to delete from the list of database. Clicking on the "Delete Planet" submits the delete action and the planet is removed from the list of database.

### Lessons Learned

This project helped me understand more about Controllers (relational mapping/the data pattern itself) actually pass/receive data from the form actions and how that data ultimately is presented in the View.
I learned how the CRUD methods are made.
I learned more about syntax early on, and understood how the Model worked in concept.
I learned more about GET/query to database and 'create/post' to forward the form field to object work to the JDBCImpl.
I learned about mySQLWorkBench and how to create a brand new set of database.


### Technology Used

1. MySQL Database for Objects, creating my own database (planets)
2. Updating the data in the mySQLWorkBench and forward engineering them
2. Connecting the database to JPACrudProject codes in spring Tool Suit
2. DAO (Connectivity)
3. CRUD (in the PS)
4. HTML/CSS (Bootstrap)
5. Spring (JSP, XML config, etc.)
6. Junit test for the entity file (planet) successful
