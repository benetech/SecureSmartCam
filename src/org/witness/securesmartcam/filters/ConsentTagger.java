package org.witness.securesmartcam.filters;

import java.util.Properties;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class ConsentTagger implements RegionProcesser
{
	Properties mProps;
	
	public ConsentTagger ()
	{
		mProps = new Properties ();
		mProps.put("id", "");
	}
	
	@Override
	public void processRegion (Rect rect, Canvas canvas,  Bitmap bitmap) 
	{
		
	}

	public Properties getProperties()
	{
		return mProps;
	}
	
	public void setProperties(Properties props)
	{
		mProps = props;
	}
}