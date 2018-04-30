`CycleAvoidingMappingContext`

Using a HashMap for storing known instance, this context will use
the map for getting known instance out of the map, instead of 
creating new one, which will lead to the famous Stack OverFlow
exception.

