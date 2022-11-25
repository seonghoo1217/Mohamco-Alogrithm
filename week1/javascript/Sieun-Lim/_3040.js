// elapsed time: 01:42:39

const fs = require("fs");
let input = fs.readFileSync("./input.txt").toString().split("\n");
let arr = input.map((i) => Number(i));

console.log(solution(arr));

function solution(arr) {
  let answer = [...arr];
  let liar = answer.reduce((a, b) => a + b) - 100;

  for (let i = 0; i < answer.length; i++) {
    let idx = answer.indexOf(liar - answer[i]);

    if (idx !== -1) {
      answer.splice(idx, 1);
      answer.splice(i, 1);

      break;
    }
  }

  return answer;
}
