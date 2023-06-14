<h1>Concurrency</h1>
<h2>Race condition</h2>
<p>
when many threads try to modify a resource at the same time

<h3>Terms</h3>
<ul>
<li>
<b>Visibility problem: </b> When a tread modify a resource and other read false values
</li>

<li>
<b>Thread safe code:</b> concurrent code that is safe to be executed by multiple threads without an issue
</li>
</ul>

<h3>Race condition solution</h3>
<ul>
<li>
<b>Confinement: </b> 
Each thread deals with his own resource and combine to the main
 one once all completed (simplest)
</li>

<li>
<b>Immutability:</b> sharing immutable object between threads is all fine,
 because threads will be able to read the object, not to modify it
</li>

<li>
<b>Synchronization:</b> Using a lock to stop other threads from modifying an object, 
so it ensures one thread to modify it at a time.<br>
Note: Synchronization should be avoided at all cost since it can lead to dead lock.
</li>

<li>
<b>Atomic object:</b>
</li>

<li>
<b>Partition:</b>
</li>

</ul>