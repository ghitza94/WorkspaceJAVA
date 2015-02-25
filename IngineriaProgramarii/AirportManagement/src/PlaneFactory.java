import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

/**
 * 
 */

/**
 * @author Virgil Barcan & Morosanu Dan
 *
 */
public class PlaneFactory implements IFactory  
{

	//the pairs (nameOfObject, constructorOfObject)
	private Map<String, IAircraft> callbacks;
	private ArrayList<String> planeTypes;
	
	/* (non-Javadoc)
	 * @see IFactory#register()
	 */
	@Override
	public boolean register(String typeOfPlane, IAircraft functor) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see IFactory#unregister()
	 */
	@Override
	public boolean unregister(String typeOfPlane) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	public Plane createPlane(String planeType)
	{	
		String packageName = Plane.class.getPackage().getName();
		
		Reflections reflections = new Reflections(packageName); 
		
		Set<Class<? extends Plane>> allPlanes = reflections.getSubTypesOf(Plane.class);
		
		Iterator<Class<? extends Plane>> it = allPlanes.iterator();
		
		while (it.hasNext())
		{
			try
			{
				Plane plane = it.next().newInstance();
				
				if (plane.getPlaneType().equals(planeType))
				{
					return plane;
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		return null;
	}
	
}
