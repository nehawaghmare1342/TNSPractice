package com.tnsif.dayseven.overloading;

import java.awt.Color;
import java.util.Scanner;

public class Colour {

	protected Colour getColour()
	{
		Colour s = new Colour();
		return s;
	}


class Red extends Colour{
	protected Red getColor()
	{
		Red s = new Red();
		return s;
	}
}
class Yellow extends Colour{
	protected Yellow getColour()
	{
		Yellow s=new Yellow();
		return s;
	}
}
}
