# scoverage-multi-module

Multi-module project showing scoverage aggregation issues.

Note the 2-pass execution of `coverage test`.

```
git clean -xdf
sbt clean coverage test
sbt coverage test
sbt coverageAggregate
```