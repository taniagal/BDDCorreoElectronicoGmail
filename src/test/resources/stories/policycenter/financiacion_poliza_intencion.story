Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Informacion de la poliza - Deseo financiar la poliza
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la cotizacion <cotizacion>
And estoy indicando la informacion de la poliza
When I do something
Then system is in a different state