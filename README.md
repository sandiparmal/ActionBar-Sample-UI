ActionBar-Sample-UI
===================

This is Sample Action Bar project which show how to create Action Bar UI   

First create one activity and extend   

     ActionBar.OnNavigationListener      
     
/** Listener interface for ActionBar navigation events.*/
     
Like    

    public class MainActivity extends Activity implements ActionBar.OnNavigationListener {

Then we will create action bar instance and intialize this.  

    private ActionBar actionBar;   
    
    /** initialize action bar*/   
		/** getActionBAr() Retrieve a reference to this activity's ActionBar.*/   
		
		actionBar = getActionBar();
		  
		/** show title on action bar true or false*/
	   actionBar.setDisplayShowTitleEnabled(true);

	   /** set title to action bar*/ 
     actionBar.setTitle("We're here ");   
     
     
Then we create one menu file and three menu in it. then we need to show this menus on action bar so we use following property.    

      android:showAsAction="ifRoom"
You can use **always** **never** for this also.    

ShowAsAction will place your menus on Action bar.   


