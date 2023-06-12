# software-patterns
## observer
observer pattern - this is a behavioral design pattern that creates a subscription mechanism that allows one object to monitor and respond to events occurring in other objects.
1. Publisher opens his business and starts to publish some events
2. You can offer a subscription then every time event happens you will receive an event. 
3. When you dont want to be a subscriber you can unsubscribe from events
4. While publisher exist it produces some events. Watchers are subscribing and unsubscribing
Observer pattern implements one-to-many relation. Java Observer API is deprecated because of its limitations.

