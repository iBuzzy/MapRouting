#MapRouting
simple way to rout to point 
  

 
## usage
add this cod to project and init params 
 
In Android Studio, this line ti <root project>app\build.gradle file:	
<pre><code> 
allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
 }
}
</code></pre>
In Android Studio, this line ti <root project>app\build.gradle file:	
<pre><code> 
dependencies {
   compile 'com.github.gholamfarkhani:MapRouting:1.5.0'
}
</code></pre>
 sample code for use 	
<pre><code> 
new MapDirection.Builder()
 .setOriginPoint(new LatLng(36.334068, 59.546783))
 .setDestinationPoint(new LatLng(36.337592, 59.469463))
 .setGoogleMap(mMap)
 .build();
</code></pre>

good luck
 ## ScreenShots
![Minion](https://github.com/gholamfarkhani/MapRouting/blob/master/map_ruting_screenshot.png)