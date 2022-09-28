<div data-target="readme-toc.content" class="Box-body px-5 pb-5">
            <article class="markdown-body entry-content container-lg" itemprop="text"><h1 dir="auto"><a id="user-content-calendar" class="anchor" aria-hidden="true" href="#calendar"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Calendar</h1>
<p dir="auto">In this assignment, we consider three types of events:</p>
<ul dir="auto">
<li>one-time events</li>
<li>events which occur every <span><span><span>nn</span><span><span><span></span><span>n</span></span></span></span></span> days (for ever)</li>
<li>events which occur within a fixed time span every <span><span><span>nn</span><span><span><span></span><span>n</span></span></span></span></span> days</li>
</ul>
<p dir="auto">These types, we want to realize by means of inheritance:</p>
<p dir="auto"><a target="_blank" rel="noopener noreferrer nofollow" href="https://camo.githubusercontent.com/c4890f1f673c156e4693b9e23fd03882993a70496e0ba698630d9f27f9414b9a/68747470733a2f2f73796e63616e6473686172652e6c727a2e64652f646c2f66694c59383635376956676f324864736a746775666d67382f63616c656e6461722e706e67"><img alt="" src="https://camo.githubusercontent.com/c4890f1f673c156e4693b9e23fd03882993a70496e0ba698630d9f27f9414b9a/68747470733a2f2f73796e63616e6473686172652e6c727a2e64652f646c2f66694c59383635376956676f324864736a746775666d67382f63616c656e6461722e706e67" data-canonical-src="https://syncandshare.lrz.de/dl/fiLY8657iVgo2Hdsjtgufmg8/calendar.png" style="max-width: 100%;"></a></p>
<p dir="auto">For simplicity, we assume that all time points (begin as well as end of time spans)
are specified in days counted from some start day onward.</p>
<p dir="auto">Realize the given <code>Event</code> hierarchy. The constructors should initialize all attributes
and expect corresponding parameters in the order as listed in the diagram, starting with
the parameters for initializing the attributes of the highest super-class.</p>
<p dir="auto">The method <code>diff</code> should determine in how many days relative to the given time point <code>day</code> the
event will next take place.
In case of past or single events, a negative number may be returned. Examples:</p>
<ul dir="auto">
<li>For a infinitely repeating event <code>t</code> which, since day 25 is repeated every week,
the call <code>t.diff(27)</code> returns the number 5.</li>
<li>For an event which, in the time span from the 2. to the 32 day, repeats every 3 days,
i.e., on days <span><span><span>(2,5,…,26,29,32)(2, 5, \ldots, 26, 29, 32)</span><span><span><span></span><span>(</span><span>2</span><span>,</span><span></span><span>5</span><span>,</span><span></span><span>…</span><span></span><span>,</span><span></span><span>2</span><span>6</span><span>,</span><span></span><span>2</span><span>9</span><span>,</span><span></span><span>3</span><span>2</span><span>)</span></span></span></span></span>, the call <code>t.diff(27)</code> returns the number 2.
The call <code>t.diff(33)</code>, on the other hand, should return -1 (the closest event occured the previous
day).</li>
</ul>
<p dir="auto">Now realize the class <code>Calendar</code> which maintains a set of events in a list of events.
The implementation of the list is already available within the template, familiarize yourself
with that.
The calendar provides the following functionality:</p>
<ul dir="auto">
<li>addition of new events (<code>addNewEvent(Event event)</code>)</li>
<li>Querying of the events of a given day (<code>Event[] eventsAt(int day)</code>)
<em>Hint: The events in the array should occur in exactly the same order as in the list.</em></li>
<li>The next event to happen relative to a given day (<code>Event nextEvent(int day)</code>)
<em>In case of multiple events occurring at the same day, the first of these in the list
should be returned.</em></li>
</ul>



</article>
          </div>
