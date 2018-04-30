`CycleAvoidingMappingContext`

Using a HashMap for storing known instance, this context will use
the map for getting known instance out of the map, instead of 
creating new one, which will lead to the famous Stack OverFlow
exception.

In order to use `CycleAvoidingMappingContext`'s map we
need to override the equals and hashCode methods
so the hash-map could identify the identity of the object.
