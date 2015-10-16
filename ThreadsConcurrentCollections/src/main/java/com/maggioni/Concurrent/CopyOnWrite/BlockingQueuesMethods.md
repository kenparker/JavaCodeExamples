| Method   |      Genral Purpose      |  Return     | Blocking |Comments   |
|----------|:------------------------:|-------------|----------|-----------|
|add(E e)  |Insert an Object          |true         |No        |IllegalStateException if the queue is bounded and full|
|          |                          |false        |          |If duplicate Objects are not allowed return false|
|offer(E e)|Insert an Object          |true         |No        ||
|          |                          |false        |          |If the queue is bounded and full return false|
|put(E e)  |Insert an Object          |void         |Yes       |If needed will block until space in the queue is available|
|offer(...)|Insert an Object          |true         |No        ||
|          |                          |false        |No        |If object cannot be added in the specified time, return false|
|          |                          |             |          ||
|remove(..)|Remove an Object          |true         |No        |Remove an Object if found|
|          |                          |false        |          ||
|poll(..)  |Remove an Object          |E            |No        |Removes the first object in the Queue und return it|
|          |                          |Null         |          |If queue is empty or timeout expired return null|
|take()    |Remove an Object          |E            |Yes       |Remove and return the first object in the queue, it blocks until an object become available|
|          |                          |             |          ||
|element() |Retrieve an Object        |E            |No        |Retrive the first element in the queue without removing, NoSuchElementException is queue is empty|
|peek()    |Retrieve an Object        |E            |No        |Retrieve the first (Head) element if present|
|          |                          |null         |          |if empty|
   
