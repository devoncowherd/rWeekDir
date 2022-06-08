### Notes W6D1

---

### RX Java/ RX Kotlin

---

- What are RXKotlin and RXJava? What is Kotlin flow?
    - Reactive Programming! This is asynchronous programming to handle real-time updates to subscribers (asynchronous data streams)
- Observables / Subscribing (feeds/alarms/etc), etc
- Which events are asynchronous?
    - Click Events
    - IoT (Internet of Things)
    - Push Notifications
    - Keyboard Input
    - Reading a File
    - Databass Access
    - Device Sensor Updates
    - Coroutines = Dispatchers.IO, RXKotlin = Schedulers.IO

---

### Data Transformation

---

- Maps = Associations, projections, keys, and values. Maps interact with every variable in-scope
- Analytics is all about reducing data to smaller subsets of values
    - i.e. a school - map the data into categories such as subject, instrutors, students, administration, subjects, etc.
- When it comes to maps and observables, transformations are one by one
- Mapping will not overwrite lists. Mapping will generate a new object
- Observables can... Emit, Be Hot, Be Cold
- Operators ... .map(), .filter(), .flat()