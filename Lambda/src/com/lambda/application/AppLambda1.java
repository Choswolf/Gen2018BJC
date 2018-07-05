package com.lambda.application;
import com.lambda.misclases.*;

public class AppLambda1{
	public static void main(String[] args) {
		
		Drawable d = new Drawable(){
			public void draw(){
				System.out.println("Hola Munditu");
			}
		};
		d.draw();
	}
}
			
				

