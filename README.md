Lab 5: Proxy Pattern and Flyweight Pattern

Flyweight Pattern – Map Application with Location Markers
Problem Statement:
In a map application that renders thousands of location markers (e.g., gas stations, restaurants, hospitals), each marker shares common styles (icon type, color, label style). Instead of duplicating the style data for each marker, we can use the Flyweight Pattern to share styles among markers, thus optimizing memory usage and improving performance.

Solution:
The Flyweight Pattern is implemented to avoid storing redundant style data in each marker. A MarkerStyleFactory manages the creation of shared style objects. Each marker only stores a reference to the shared style object, reducing memory usage significantly.

Classes:
MarkerStyle (Interface) - Defines a method for displaying the marker style.

RestaurantStyle and HospitalStyle (Concrete Classes) - Represent the specific styles for different types of locations (e.g., restaurants and hospitals).

MarkerStyleFactory - Manages the creation and sharing of MarkerStyle objects. Ensures that only one instance of each unique style is created.

Marker - Represents a location marker on the map. Each marker references a shared MarkerStyle object.

Output example:
![image](https://github.com/user-attachments/assets/a9c9b368-c98b-4def-813d-e1ad76fd7d48)



Proxy Pattern – Image Management System
Problem Statement:
In a real estate agency, agents upload high-resolution images of properties. However, for a website to load efficiently, full-resolution images should only be loaded when a user clicks to zoom in. Instead of loading the full image immediately, a proxy (stand-in) can be used to show a low-resolution thumbnail initially, and then load the high-resolution image when necessary.

Solution:
The Proxy Pattern is implemented here to handle the loading of images in a lazy manner. A Proxy class (ImageProxy) acts as a stand-in for the actual image (RealImage). It loads the full-resolution image only when requested by the user.

Classes:
Image (Interface) - Defines a method for displaying the image.

RealImage (Concrete Class) - Represents the actual image and implements the Image interface.

ImageProxy (Proxy Class) - Implements the Image interface and controls the access to the real image. It only loads the real image when needed.

Output example:
![image](https://github.com/user-attachments/assets/231c81fb-21c0-4173-ae61-0da9420075ef)
