//01:34:30
function solution(data) {
  let input = data.toString().trim().split('\n');
  let answer = [];
  for (let i = 0; i < input.length - 1; i++) {
    const str = input[i];
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    let bool = false;
    for (let j = 0; j < vowels.length; j++) {
      if (str.includes(vowels[j])) bool = true;
    }
    const arr = [];
    for (let j = 0; j < str.length; j++) {
      if (vowels.includes(str[j])) arr.push(0);
      else arr.push(1);
    }
    let count = 1;
    for (let j = 0; j < arr.length; j++) {
      if (arr[j] === arr[j + 1]) count += 1;
      else count = 1;

      if (count === 3) {
        bool = false;
        break;
      }
    }
    for (let j = 0; j < str.length; j++) {
      if (str[j] === str[j + 1]) {
        if (str[j] !== 'e' && str[j] !== 'o') bool = false;
      }
    }
    if (bool === true) console.log('<' + str + '> is acceptable.');
    else console.log('<' + str + '> is not acceptable.');
  }
}

const case1 = `a
tv
ptoui
bontres
zoggax
wiinq
eep
houctuh
end`;

solution(case1);
