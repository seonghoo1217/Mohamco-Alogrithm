function solution(params) {
  let [n, ...arr] = params.toString().trim().split('\n');

  let set = new Set();

  set.add('ChongChong');

  for (let i = 0; i < n; i++) {
    const [a, b] = arr[i].split(' ');

    if (set.has(a)) {
      set.add(b);
    } else if (set.has(b)) {
      set.add(a);
    }
  }
  return set.size;
}

const case1 = `12
bnb2011 chansol
chansol chogahui05
chogahui05 jthis
jthis ChongChong
jthis jyheo98
jyheo98 lms0806
lms0806 pichulia
pichulia pjshwa
pjshwa r4pidstart
r4pidstart swoon
swoon tony9402
tony9402 bnb2011`;

console.log(solution(case1));
