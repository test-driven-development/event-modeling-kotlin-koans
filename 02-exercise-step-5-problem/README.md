# Exercise 2, Step 5

### [Review: state change slice](https://www.youtube.com/embed/Gx-ZjZiNiWs?si=WZZ8sCOiuMXUAo45?&start=209&end=252)

### [Review: state view slice](https://www.youtube.com/embed/Gx-ZjZiNiWs?si=WZZ8sCOiuMXUAo45?&start=506&end=514)

### [external state import slice](https://www.youtube.com/embed/vX08Qt5xHsY?si=ibBy5SDK2B9RNAak?&start=288&end=394)

### [external state export slice](https://www.youtube.com/embed/vX08Qt5xHsY?si=ibBy5SDK2B9RNAak?&start=394&end=495)

<br>

(Based on improved understanding, the student's solution is 
reconciled to a degree with the instructor's.)

The event model partitions into independent business value streams: 

[evidentdesign.com import](event-model.json)

instructor's solution
![instructor's solution](event-model.png "instructor's solution")

student's solution
<br>
![student's solution](event-model.jpg "student's solution")

Pivotal events – those that typically begin or end a business 
process – are places were communication between the value streams
is required.

To integrate the value streams, apply (1) external state import 
slices, or internal state export slices:

(1) For an external state import slices triggered on external Events,
    we can connect an event from an external stream to a command, and
    that command to an event on our local stream.  For external state
    import slices triggered on the state of an external read model, we
    can connect the external read model to a job/gear-type interface to
    a local command to a local event.
<br>

(2) For an internal state export slice, we connect a "TODO-list" read
    model to a job/gear-type tnterface, the job/gear-type interface to
    an external command, and then either record a local event recording
    the result of that command (and connect these via an arrow), or
    else we observe the effect of our command on the external event
    stream and perform an external state import.
