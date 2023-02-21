public OptionGroup addOption(Option opt) { [EOL]     optionMap.put(opt.getKey(), opt); [EOL]     return this; [EOL] } <line_num>: 44,51
public Collection getNames() { [EOL]     return optionMap.keySet(); [EOL] } <line_num>: 57,61
public Collection getOptions() { [EOL]     return optionMap.values(); [EOL] } <line_num>: 66,70
public void setSelected(Option opt) throws AlreadySelectedException { [EOL]     if ((this.selected == null) || this.selected.equals(opt.getOpt())) { [EOL]         this.selected = opt.getOpt(); [EOL]     } else { [EOL]         throw new AlreadySelectedException("an option from this group has " + "already been selected: '" + selected + "'"); [EOL]     } [EOL] } <line_num>: 78,94
public String getSelected() { [EOL]     return selected; [EOL] } <line_num>: 99,102
public void setRequired(boolean required) { [EOL]     this.required = required; [EOL] } <line_num>: 107,110
public boolean isRequired() { [EOL]     return this.required; [EOL] } <line_num>: 117,120
public String toString() { [EOL]     StringBuffer buff = new StringBuffer(); [EOL]     Iterator iter = getOptions().iterator(); [EOL]     buff.append("["); [EOL]     while (iter.hasNext()) { [EOL]         Option option = (Option) iter.next(); [EOL]         if (option.getOpt() != null) { [EOL]             buff.append("-"); [EOL]             buff.append(option.getOpt()); [EOL]         } else { [EOL]             buff.append("--"); [EOL]             buff.append(option.getLongOpt()); [EOL]         } [EOL]         buff.append(" "); [EOL]         buff.append(option.getDescription()); [EOL]         if (iter.hasNext()) { [EOL]             buff.append(", "); [EOL]         } [EOL]     } [EOL]     buff.append("]"); [EOL]     return buff.toString(); [EOL] } <line_num>: 126,161
