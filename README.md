# software-patterns
### Important design principles
1. Encapsulate everything what you can
2. Composition more preferred then inheritance
3. Program on interface level
4. Low coupling between communicating objects more preferable
5. Classes should be open for extension, closed for modification
6. Code should be dependent on abstractions not concrete classes

## Observer
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

## Factory
factory pattern - factory more like a principle of programming, not a pattern. It encapsulates creating objects in one
place allowing other code use only factory methods.

## Command
command pattern - Encapsulates command request in object to make it possible parametrize client object. Making possibility 
to organize the queue or request registration or cancellation of the requests. Decouples entities that needs to execute commands from entities that actually performing this commands.
Commands can be used in transactions
Command loading:
1. Client creates command object
2. Client calls setCommand() to save command object in the initiator
3. Later client call initiator to execute the command
4. Macrocommands can contain several commands

## Adapter
adapter pattern - changes interface from one class to another to make it possible work with different interfaces.
## Facade 
facade pattern - provides unique high-level interface to subsystem that encapsulate several interfaces.
Example: we have a cinema and to start/stop watching film we need to perform some actions like turn on/off the screen, 
choose disk, insert dvd, prepare food and so on. Facade will be 1 class with methods `startSession` and `endSession`
## Template Method
template method - makes initial algorithm skeleton in method. Subclasses are implementing the actual behaviour.
