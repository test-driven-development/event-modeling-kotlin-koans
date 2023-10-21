# Exercise 2, Step 3

### [link to module (state change slice)](https://www.youtube.com/embed/Gx-ZjZiNiWs?si=WZZ8sCOiuMXUAo45?&start=209&end=235)
### [link to module (state view slice)](https://www.youtube.com/embed/Gx-ZjZiNiWs?si=WZZ8sCOiuMXUAo45?&start=497&end=511)

<br>

We've introduced read models to inform the user of the state of the
system.  The commands and read models constitute a comprehensive API
for the system:

[evidentdesign.com import](event-model.json)

instructor's solution
![instructor's solution](event-model.png "instructor's solution")

student's solution
<br>
![student's solution](event-model.jpg "student's solution")

Now we simply connect the "slices" via data-flow arrows:

(1) connect interface to command to event to expose a state change 
    slice; and,
<br>
(2) connect event to read model to interface to expose a state-view
    slice.

When we're done, the information flow should resemble a sine 
(or sinusoidal) wave.

We'll expose data flows for the other two types of slices – external
state import and internal state export – as we encounter them in the
next two steps.
