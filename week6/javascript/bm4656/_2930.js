//00:40:30 ~
const check_win = (a, b) => {
  if (a == 'R') {
    if (b == 'R') return 1;
    if (b == 'S') return 2;
    if (b == 'P') return 0;
  }
  if (a == 'S') {
    if (b == 'R') return 0;
    if (b == 'S') return 1;
    if (b == 'P') return 2;
  }
  if (a == 'P') {
    if (b == 'R') return 2;
    if (b == 'S') return 0;
    if (b == 'P') return 1;
  }
};
function solution(data) {
  let [R, sg, N, ...arr] = data.toString().trim().split('\n');
  sg = sg.split('');
  arr = arr.map(i => i.split(''));
  // console.log(sg);
  let answer1 = 0;
  // let answer2 = 0;
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < R; j++) {
      answer1 += check_win(sg[j], arr[i][j]);
    }
  }
  return answer1;
  // console.log(answer2);
}

const case1 = `5
SSPPR
1
SSPPR`;

const case2 = `5
SSPPR
2
PPRRS
RRSSP`;
console.log(solution(case1));
console.log(solution(case2));
