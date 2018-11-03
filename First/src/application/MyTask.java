package application;

import java.util.concurrent.TimeUnit;

import javafx.concurrent.Task;
import javafx.scene.image.ImageView;

public class MyTask extends Task {
 ImageView myImage;
 boolean direction = true;
 int x=0;
 public MyTask (ImageView myImage) {
	 
	 
 }
 @Override
 protected Object call() throws Exception {
	 boolean d=true;
 
	 while(d) {
		 if (direction) {
			 x+=20;
			 myImage.setX(x);
			 TimeUnit.SECONDS.sleep(1);
			 x+=20;
			 myImage.setX(x);
			 TimeUnit.SECONDS.sleep(1);
			 x+=20;
			 myImage.setX(x);
			 TimeUnit.SECONDS.sleep(1);
			 direction=false;
		 } else {
			 x-=20;
			 myImage.setX(x);
			 TimeUnit.SECONDS.sleep(1);
			 x-=20;
			 myImage.setX(x);
			 TimeUnit.SECONDS.sleep(1);
			 x-=20;
			 myImage.setX(x);
			 TimeUnit.SECONDS.sleep(1);
			 direction=true;
		 }
 } 
	 return null;
}
}
