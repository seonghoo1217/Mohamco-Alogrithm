//00:14:04
function solution(case1) {
  const input = case1.split("\n");
  const [N, ...people] = input;
  let arr = people.map((v) => v.split(" "));
  let dance = ["ChongChong"];
  for (let i = 0; i < Number(N); i += 1) {
    for (let j = 0; j < dance.length; j += 1) {
      if (arr[i].includes(dance[j])) {
        arr[i].forEach((el) => dance.push(el));
        break;
      }
    }
  }
  return dance.filter((el, i) => dance.indexOf(el) === i).length;
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
