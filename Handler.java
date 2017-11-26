
package pkg360.practice;

import java.util.HashMap;

/**
 *
 * @author Matthew
 */
public class Handler {
        HomeView home = new HomeView();
        BookView booklist = new BookView();
        OutView out = new OutView();

        //HashMap hmap = new HashMap();
        HashMap<Integer,View> hmap = new HashMap<Integer,View>();

    public void handleIt(int handle) {
        
        hmap.put(1, booklist);
        hmap.put(2, out);
        hmap.put(3, home);
            
        View tempView = hmap.get(handle);
        
        tempView.display();
    }
}