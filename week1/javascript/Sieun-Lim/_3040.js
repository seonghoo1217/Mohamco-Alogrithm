// elapsed time: 01:42:39

function solution(arr) {
  let answer = arr;
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

let data = [8, 6, 5, 1, 37, 30, 28, 22, 36];
console.log(solution(data));
