# Practical event modeling course exercises

These exercises are designed to follow along with the [course modules](https://www.youtube.com/playlist?list=PLa7VYi0yPIH2jkYeRenjKCMxODp8z6dPy)
to provide hands-on practical experience.  

The first two exercises are pure event modeling, and can be completed
using nothing more than some sticky notes and a pencil, or your
favorite drawing/diagramming application.  They will
include links to images of how the event model should appear as it 
evolves. 

Each step will include a link to a 
[JSON export](https://docs.onote.com/onote-docs/Latest/models/import-export-models.html) 
of the event model that can be used in the third-party event modeling tool, 
[Evident Design](https://evidentstack.com/).

Exercise 3 involves actually implementing in code the system design
that we captured in the event model.  The codebase is written in 
[Kotlin](https://kotlinlang.org/) for two reasons:

* To make use of to the excellent
  [Kafka Java Client](https://docs.confluent.io/kafka-clients/java/current/overview.html)
  and [Kafka Streams Library](https://docs.confluent.io/platform/current/streams/overview.html)
  via Kotlin's easy Java interop
* To illustrate some of the functional domain modeling techniques for
  implementing the event model as described in the course

## How to use this repository

Each exercise is a named branch that links to a detailed README containing instructions,
event model images/exports, and codebases at various stages
of completion.

## Use-case

The exercises as outlined below are built around the example system 
described throughout the course: 

* **_an autonomous vehicle ride reservation system_**. 

Rather than leaving their vehicles sitting idle for hours, for example 
while at work, vehicle owners can make their autonomous vehicles 
available to pick up and drop off riders like a traditional 
ride-sharing service.

First, owners must register their vehicles with our service using the
vehicle's VIN number.

Next, owners make vehicles available to our service for a specific
period.

Then, riders can schedule and pay for rides, and can either cancel
prior to pickup, or else confirm pickup and drop-off.

When the owner needs their vehicle, they request its return to take it
out of circulation.

Finally, if they no longer want an account, owners can unregister
their vehicles from our service.

## [Exercise 1](https://youtu.be/gNUIPMiUuMM?si=Tig26tbNBK3wDMdW): Build the Storyboard

This begins the module ending at ["The event
modeling Workshop: Step 2, Envisioning the User Experience"](https://youtu.be/o6cKBjUOzhs?si=ysSXxMbsp-7wRZDP).

In this exercise, we'll build our event model up to the point of
functioning like a storyboard for a film.

## [Exercise 2](https://youtu.be/Gx-ZjZiNiWs?si=3Wjnd3T52BJkCfHJ): Completing the event model

This begins the module ending at ["The event
modeling Workshop: Step 4, Identifying and Integrating event Streams"](https://youtu.be/vX08Qt5xHsY?si=7otnLFEeDMPJb_VV).

In this exercise, we'll complete our event model by identifying our
Command and Read model API, connecting the model components together
with data flow arrows, and identifying and integrating our event Streams.

## [Exercise 3](https://youtu.be/XqOG-2C8FzE?si=GqfRf-gXWFBGa7Um): Implementing an event model on the Streaming Data Platform

This begins the module ending at ["Implementing event modelled Systems on the Streaming Data Platform"](https://youtu.be/p-i6_FkEo5I?si=_rLVMB_rR-g7UF5x),
and just before the conclusion module for the course.

In this exercise, we'll turn our model into code to run our system on
the Streaming Data Platform. The event model will guide our creation
of domain Transfer Objects, domain Types, and our Decide and Evolve
functions. Finally, we'll wire these code components into the Kafka
Producer and Streams APIs.

Each step has its own directory containing a README with instructions,
and with tests that initially fail.
