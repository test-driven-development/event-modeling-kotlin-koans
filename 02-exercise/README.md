# Exercise 2

We now have a storyboard of our system:  the sequence of domain 
events with interfaces highlighting key moments of the user experience.

On that basis we'll complete our event model by identifying our 
command and read model API, connecting the model artifacts together 
with data flow arrows, and identifying / integrating our event 
streams.

(1) We'll pick up where we left off by identifying the command that 
    is the immediate cause of each event.  When done, the
    model should look something like this:
<br/>

[evidentdesign.com import](event-model-01.json)

instructor's solution
![instructor's solution](event-model-01.png "instructor's solution")

(2) Next, we'll aggregate our various events into read models to 
    inform our users.  When completed, the model should look 
    something like this:
<br/>

[evidentdesign.com import](event-model-02.json)

instructor's solution
![instructor's solution](event-model-02.png "instructor's solution")

(3) We'll simply connect model components with arrows to create our 
    sinusoidal information flow for the state change and state view 
    slices, after which, the model should look like this:
<br/>

[evidentdesign.com import](event-model-03.json)

instructor's solution
![instructor's solution](event-model-03.png "instructor's solution")

(4) With our information flow mostly modelled, we'll gather the 
    events into separate stream lanes representing our independent 
    causal narratives, which will make the model look like this:
<br/>

[evidentdesign.com import](event-model-04.json)

instructor's solution
![instructor's solution](event-model-04.png "instructor's solution")

(5) Finally, we'll design the necessary integrations among those 
    streams by identifying when a stream needs to import events or 
    read models from another stream (i.e., an external state import 
    slice); or, when a stream needs to directly cause change by 
    invoking another stream's command interface (i.e., an internal 
    state export slice) and react to resulting foreign events; or, 
    to record local result events.  
<br/>
    When we've identified and integrated these specific use cases, the model should
    look like this:
<br/>

[evidentdesign.com import](event-model-05.json)

instructor's solution
![instructor's solution](event-model-05.png "instructor's solution")
