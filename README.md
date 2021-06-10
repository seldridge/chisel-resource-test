A standalone project that tests that https://github.com/chipsalliance/chisel3/pull/1954 continues to work for dsptools.

In order to test this, you need to publish FIRRTL and Chisel (from that PR) locally.
Then do an `sbt run`.
You should wind up with two files in the output `build/` directory:

1. `BBFACos.v` which is pulled from dsptools
2. `herpderp.v` which is pulled from the local resource

Note: this was flaky for me at first until I aggressively pruned all locally cached dependencies. I *think* it works....
