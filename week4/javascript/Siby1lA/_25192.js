// 00:24:03
function solution(data) {
  const CHAT_DATA = data.split("\n");
  const CHAT_SIZE = Number(CHAT_DATA.splice(0, 1).join(""));
  let duplicateList = new Set();
  let count = 0;
  for (let i = 1; i < CHAT_SIZE; i++) {
    if (!duplicateList.has(CHAT_DATA[i])) {
      duplicateList.add(CHAT_DATA[i]);
      if (CHAT_DATA[i] !== "ENTER") {
        count++;
      } else {
        duplicateList.clear();
      }
    }
  }
  return count;
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
tony9402
`;

const case2 = `7
ENTER
pjshwa
chansol
chogahui05
ENTER
pjshwa
chansol
`;

const case3 = `3
ENTER
lms0806
lms0806`;

console.log(solution(case1));
console.log(solution(case2));
console.log(solution(case3));
