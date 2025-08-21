package Z_Pattern1.SatergyPattern.problematic_Code;
/*

What it is
- Strategy Pattern lets you define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.
- The client code depends on an abstract strategy, not concrete implementations. This avoids conditionals like long if-else/switch chains.

When to use it
- You have multiple ways to perform a task, and you want to pick one at runtime.
- You’re seeing repeated if/else based on a “mode,” “type,” or “flag.”
- You want to vary behavior without subclassing the client.
- You need to add new behaviors without changing existing client code (open/closed principle).

Typical Java use cases
- Sorting: pass different Comparators to change ordering.
- Validation or filtering: pass Predicate strategies.
- Caching/eviction policies, retry/backoff policies.
- Payment/shipping/tax calculation methods in business logic.
- Logging/formatting strategies (e.g., different formatters).
- Task-scheduling or rejection policies in thread pools.

Examples already in the JDK
- Comparator<T> is a strategy for comparison. Collections.sort(list, comparator) or list.sort(comparator) selects the sorting strategy.
- java.util.function.* (Predicate, Function, Consumer, UnaryOperator) are functional strategy interfaces used across streams and collections APIs.
- ThreadPoolExecutor.RejectedExecutionHandler provides different strategies for handling rejected tasks.

How to recognize you need Strategy
- Conditionals selecting behavior multiply across the codebase.
- New “types” require changing many places.
- You want to unit-test behaviors independently.

Benefits
- Replaces conditionals with polymorphism.
- Easier to add new behaviors.
- Improves testability and separation of concerns.

Trade-offs
- More classes/interfaces (unless you use lambdas).
- You still need a place to choose which strategy to use (factory, config, DI).
*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BatteryEngine> batteryEngines = new ArrayList<>();
        batteryEngines.add(new XUV400());

        for(BatteryEngine BE:batteryEngines){
            BE.getBattery();
        }
    }
}
