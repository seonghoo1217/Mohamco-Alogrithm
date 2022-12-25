//00:20:23
function solution(data) {
  let input = data.toString().trim().split('\n');
  const n = input[0];
  let cnt = 0;
  let set = new Set();
  for (let i = 1; i <= n; i++) {
    if (input[i] == 'ENTER') {
      set.clear();
      continue;
    }
    if (set.has(input[i])) {
      continue;
    }
    set.add(input[i]);
    cnt++;
  }
  return cnt;
}

const case1 = `9
ENTER
pjshwa
chansol
chogahui05
lms0806
pichulia
r4pidstart
swoon
tony9402`;
const case2 = `7
ENTER
pjshwa
chansol
chogahui05
ENTER
pjshwa
chansol`;
const case3 = `3
ENTER
lms0806
lms0806`;

console.log(solution(case1));
console.log(solution(case2));
console.log(solution(case3));
