package question3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapesFactory {

	ArrayList<Shape> slist = new ArrayList<>();

	public ShapesFactory()
	{	}
	 public void addShape(Shape s)
     {
           slist.add(s);
      }
	public List<Circle> getCircles()
	{
		ArrayList<Circle> clist=new ArrayList<>();
		Iterator<Shape> iter= slist.iterator();
		while (iter.hasNext()) 
		{
			Shape temp=iter.next();
			if(temp.getClass().getName()=="Circle")
			{
				clist.add((Circle) temp);
			}

		}
		return clist;
	}
	
	public List<Rectangale> getRectangles()
	{
		ArrayList<Rectangale> rlist=new ArrayList<>();
		Iterator<Shape> iter= slist.iterator();
		while (iter.hasNext()) 
		{
			Shape temp=iter.next();
			if(temp.getClass().getName()=="Rectangle")
			{
				rlist.add((Rectangale)temp);
			}
		}
		return rlist;
	}

	public boolean  deleteShape(Shape s)
    {
              if(slist.contains(s))
              {
                 slist.remove(slist.indexOf(s)); 
              }
              return slist.contains(s);
    }

}
