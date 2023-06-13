# software-patterns
### Important design principles
O - Open for extension, closed for modification

Other:
composition better than inheritance
low coupling is better
encapsulate everything you can
program on interface level
## observer
observer pattern - this is a behavioral design pattern that creates a subscription mechanism that allows one object to monitor and respond to events occurring in other objects.
1. Publisher opens his business and starts to publish some events
2. You can offer a subscription then every time event happens you will receive an event. 
3. When you dont want to be a subscriber you can unsubscribe from events
4. While publisher exist it produces some events. Watchers are subscribing and unsubscribing
Observer pattern implements one-to-many relation. Java Observer API is deprecated because of its limitations.

## Decorator
decorator pattern dynamically gives the object new features and is a flexible alternative to subclassing in
the field of expanding functionality.
1. Decorator extending class functionality without changing the existing code
2. Every decorator receives the base type object as an input(composition of classes)
3. Every decorator must extend the Special decorator class and the base type
4. Bad for cases when we are programming on types level and for the  specific type we must write specific logic
5. 

